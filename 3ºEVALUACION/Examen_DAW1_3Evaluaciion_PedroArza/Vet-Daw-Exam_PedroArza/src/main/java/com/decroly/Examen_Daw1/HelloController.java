package com.decroly.Examen_Daw1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.TilePane;
import org.w3c.dom.css.CSS2Properties;

import java.io.IOException;
import java.util.List;

public class HelloController {
    @FXML
    private TextField nombreField;

    @FXML
    private TextField apellidoField;

    @FXML
    private TextField telefonoField;

    @FXML
    private ComboBox<Mascota> combobox;

    @FXML
    private ListView<Propietario> listView;


    @FXML
    private Button PropietarioButton;

    @FXML
    private Button BuscarMascotaButton;

    @FXML
    private Button MascotaButton;

    @FXML
    private Button DatosButton;

    @FXML
    private Button consultaButton;

    @FXML
    private Button exportarButton;

    @FXML
    private Button salir;

    //    lista
    ObservableList<Propietario> list = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        combobox.getItems().setAll(Mascota.values());
        listView.setItems(list);
        listView.getSelectionModel().selectedItemProperty().addListener((obs, oldVal, newVal) -> {
            if (!(newVal == null)) {
                nombreField.setText(newVal.getNombre());
                apellidoField.setText(newVal.getApellido());
                telefonoField.setText(newVal.getTelefono());
                combobox.setPromptText("Estudio");
            }
        });
    }

    @FXML
    private void handleAdd() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String telefono = telefonoField.getText();
        Mascota mascotaField = combobox.getValue();

        if (!(nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || mascotaField == null)) {
            Propietario propietario = null;
            showAlert("Exito", "mascota creado");
            list.add(null);
            listView.refresh();

            nombreField.clear();
            apellidoField.clear();
            telefonoField.clear();
            combobox.getSelectionModel().clearSelection();
        }
    }

    @FXML
    private void handleEdit() {
        Propietario seleccionado = clienteSeleccionado();
        if (seleccionado != null) {
            String nuevoNombre = nombreField.getText();
            String nuevoApellido = apellidoField.getText();
            String nuevoTelefono = telefonoField.getText();
            Mascota nuevoMascota = combobox.getValue();

            if (!(nuevoNombre.isEmpty() || nuevoApellido.isEmpty() || nuevoTelefono.isEmpty() || nuevoMascota == null)) {
                seleccionado.setNombre(nuevoNombre);
                seleccionado.setApellido(nuevoApellido);
                seleccionado.setTelefono(nuevoTelefono);
                seleccionado.setMascota(nuevoMascota);
                showAlert("Exito", "Cambios añadidos");
                listView.refresh();

                nombreField.clear();
                apellidoField.clear();
                telefonoField.clear();
                combobox.getSelectionModel().clearSelection();

            }else{
                showAlert("Error", "los campos no pueden estar vacíos");
            }
        }else{
            showAlert("Error", "no hay ninguna mascota seleccionado");
        }
    }

    @FXML
    private void handleRemove() {
        Propietario seleccionado = clienteSeleccionado();
        if (seleccionado != null) {
            list.remove(seleccionado);
            showAlert("Exito", "Mascota eliminada");
            listView.refresh();

            nombreField.clear();
            apellidoField.clear();
            telefonoField.clear();
            combobox.getSelectionModel().clearSelection();
        }
    }

    @FXML
    private void handleImport() {
        Object propietarioUtils = null;
        propietarioUtils.notify();
        listView.refresh();
    }

    @FXML
    private void handleExport() {
        List<Propietario> propietarios = listView.getItems();
       propietarios.remove(propietarios);
    }


    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private Propietario clienteSeleccionado() {
        Propietario productoSeleccionado = listView.getSelectionModel().getSelectedItem();
        if (productoSeleccionado != null) {
            MascotaButton.setDisable(false);
            DatosButton.setDisable(false);
        } else {
            MascotaButton.setDisable(true);
            DatosButton.setDisable(true);
        }
        return productoSeleccionado;
    }


}
