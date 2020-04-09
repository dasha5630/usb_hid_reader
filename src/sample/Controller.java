package sample;


import com.codeminders.hidapi.HIDDeviceInfo;
import com.codeminders.hidapi.HIDManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Controller {

    private HIDDeviceInfo deviceInfo;

    @FXML
    private Button sendButton;

    @FXML
    private TextField sendText;

    @FXML
    private TextArea receiveText;

    @FXML
    private void buttonClicked() throws IOException {
        HIDManager hidManager = HIDManager.getInstance();
        HIDDeviceInfo[] infos = hidManager.listDevices();
        receiveText.clear();
        for(HIDDeviceInfo item : infos){
            receiveText.appendText(item.getSerial_number() + "\n");
        }
    }

}
