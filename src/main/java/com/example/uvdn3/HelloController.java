package com.example.uvdn3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public ComboBox type;
    public ComboBox fuel;
    public TextField name_text;
    public TextField street_text;
    public TextField place_text;
    public TextField last_name_txt;
    public TextField house_num_text;
    public TextField postal_text;
    public TextField brand;
    public TextField horseP;
    public TextField label;
    public TextField color;
    public TextField seat_num;
    public TextField space;
    public TextField reg_num;
    public TextField reg_loc;

    public CheckBox window;
    public CheckBox parking;
    public CheckBox passenger;
    public CheckBox theft;
    public CheckBox hail;
    public CheckBox trd_per;
    public CheckBox tires;

    public DatePicker birthday;
    public DatePicker first_reg;

    public  void initialize(URL location, ResourceBundle resources) {
        type.getItems().addAll("Osebni avto", "Motor", "Kombi", "Avtobus", "Tovornjak", "Traktor");
        fuel.getItems().addAll("Bencin 95", "Bencin 98", "Dizel", "Elektrika");

        house_num_text.addEventHandler();
    }


    public void save(ActionEvent actionEvent) {
    }

    public void clear(ActionEvent actionEvent) {
        name_text.setText("");
        street_text.setText("");
        place_text.setText("");
        last_name_txt.setText("");
        house_num_text.setText("");
        postal_text.setText("");
        brand.setText("");
        horseP.setText("");
        label.setText("");
        color.setText("");
        seat_num.setText("");
        space.setText("");
        reg_num.setText("");
        reg_loc.setText("");

        window.setSelected(false);
        parking.setSelected(false);
        passenger.setSelected(false);
        theft.setSelected(false);
        hail.setSelected(false);
        trd_per.setSelected(false);
        tires.setSelected(false);

        birthday.setValue(null);
        first_reg.setValue(null);
    }
}