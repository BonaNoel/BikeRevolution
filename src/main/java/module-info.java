module hu.unideb.inf.sfm2023h10.cs3.bikerevolution {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens hu.unideb.inf.sfm2023h10.cs3.bikerevolution to javafx.fxml;
    exports hu.unideb.inf.sfm2023h10.cs3.bikerevolution;
}