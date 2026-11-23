module diseaseTracker {
    requires javafx.controls;
    requires javafx.fxml;

    opens diseaseTracker to javafx.fxml;
    exports diseaseTracker;
}