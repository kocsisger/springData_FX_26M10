package hu.unideb.inf.springdatafx_m10.frontend;

import hu.unideb.inf.springdatafx_m10.SpringDataFxM10Application;
import javafx.event.ActionEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class MainPageController {
    private ConfigurableApplicationContext ctx;

    public void startBackend(ActionEvent actionEvent) {
        ctx = SpringApplication.run(SpringDataFxM10Application.class);
    }

    public void printData(ActionEvent actionEvent) {
    }

    public void stopBackend(ActionEvent actionEvent) {
        ctx.close();
    }
}
