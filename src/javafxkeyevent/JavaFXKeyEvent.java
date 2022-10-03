/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxkeyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author JavierCastilloM
 */
public class JavaFXKeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        

        
        
        Pane pane = new Pane();
        
        
        
        Scene scene = new Scene(pane, 300, 200);
        
        
        Text text = new Text(20, 20,"A");
        text.setFocusTraversable(true);
        pane.getChildren().add(text);
        text.setOnKeyPressed(event -> {
            if(event.getCode() == KeyCode.DOWN){
                text.setY(text.getY()+10);
            }else if(event.getCode() == KeyCode.UP){
                text.setY(text.getY()-10);
            }else if(event.getCode() == KeyCode.RIGHT){
                text.setX(text.getX()+10);
            }else if(event.getCode() == KeyCode.LEFT){
                text.setX(text.getX()-10);
            }else{
                text.setText(event.getText());
            }
        });
        
        
        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
