package com.example;


import java.util.random.RandomGenerator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.VBox;
import javafx.scene.paint. Color;
import javafx.stage.Stage;




public class CountButtonApp extends Application{

int score = 0;
@Override

public void start(Stage Stage){




Label label = new Label();
label.setText("COUNTS " + score);
label.setStyle("-fx-font-size: 19px; -fx-text-fill: darkblue;");



Label quoteLabel = new Label();
quoteLabel.setStyle("-fx-text-fill: darkblue; -fx-font-size: 19px; -fx-font-style: italic; -fx-font-style: italic;");




    Button w1 = new Button("COUNT");
    w1.setPrefWidth(200);
    w1.setPrefHeight(40);

    w1.setStyle("-fx-font-size;24px; -fx-font-weight:bold; -fx-background-color:green; -fx-text-fill:white;");


    w1.setOnAction(e ->{ 

DropShadow shadow = new DropShadow();
shadow.setColor(Color.BLUE);

w1.setEffect(shadow);


        score++;
        w1.setText("COUNTING...");
        label.setText("COUNTS " + score);


String[] quotes = {

"Success usually comes to those who are too busy to be looking for it.",

"The best way to get started is to quit talking and begin doing.",

"Do something today that your future self will thank you for.",

"Small progress every day adds up to big results.",

"Your only limit is your mind.",

"Dream big, start small, but most importantly start.",

"Opportunities don't happen, you create them.",

"Great things never come from comfort zones.",

"Discipline is choosing between what you want now and what you want most.",

"Work hard in silence, let success make the noise."
};

RandomGenerator random = RandomGenerator.getDefault();









quoteLabel.setText("QUOTES: " +quotes[random.nextInt(quotes.length)]);
quoteLabel.setStyle("-fx-text-fill: blue; -fx-font-weight: blue; -fx-font-size: 19px;");




    });





Button w2 = new Button("RESET");
w2.setStyle("-fx-text-fill:red; -fx-font-weight: bold; -fx-font-size: 19px;");



w2.setOnAction(e ->{
    w1.setText("COUNT");
    w1.setStyle("-fx-font-size: 19px; -fx-font-weight:bold; -fx-text-fill:darkgreen;");
    score = 0;

    label.setText("COUNTS " + score);
    label.setStyle("-fx-text-fill: violet; -fx-font-weight: bold; -fx-font-size: 19px;");

quoteLabel.setText("QUOTES NOT AVAILABLE RIGHT NOW!");


});






VBox layout = new VBox();

layout.getChildren().addAll(label,w1,w2,quoteLabel);


Scene scene = new Scene(layout,500,400);
scene.getStylesheets().add(getClass().getResource("/style.css.txt").toExternalForm());  //CCS style sheet added to the scene

Stage.setTitle("COUNT-QUOTES BUTTON APP");
Stage.setScene(scene);


Stage.show();




    
}


public static void main(String[]args){

launch(args);

}


}