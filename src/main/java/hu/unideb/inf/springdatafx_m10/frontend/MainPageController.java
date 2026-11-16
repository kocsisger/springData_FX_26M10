package hu.unideb.inf.springdatafx_m10.frontend;

import hu.unideb.inf.springdatafx_m10.SpringDataFxM10Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {
    @FXML
    public Label nameLabel;

    private ConfigurableApplicationContext ctx;

    public void startBackend(ActionEvent actionEvent) {
        ctx = SpringApplication.run(SpringDataFxM10Application.class);
    }

    public void printData(ActionEvent actionEvent) {
        SpringDataFxM10Application springApp;
        springApp = (SpringDataFxM10Application) ctx.getBean(SpringDataFxM10Application.class);
        //springApp.printData();

        System.out.println("Printing at the frontend: " + springApp.getData());
        nameLabel.setText(springApp.getData().getName());
    }

    public void stopBackend(ActionEvent actionEvent) {
        ctx.close();
    }
}
