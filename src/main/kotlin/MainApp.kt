package org.example

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.VBox
import javafx.stage.Stage


class MainApp : Application() {
    override fun start(primaryStage: Stage) {
        val nameLabel = Label("Name: John Doe")
        val ageLabel = Label("Age: 25")
        val hobbyLabel = Label("Hobby: Photography")

        val vbox = VBox(10.0, nameLabel, ageLabel, hobbyLabel)
        val scene = Scene(vbox, 300.0, 200.0)

        primaryStage.title = "About You"
        primaryStage.scene = scene
        primaryStage.show()
    }
}

fun main() {
    Application.launch(MainApp::class.java)
}
