package lk.ijse.gdse.main;

import javafx.application.Application;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.gdse.main.config.FactoryConfiguration;
import lk.ijse.gdse.main.entity.User;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.io.IOException;

public class AppInitializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        Parent load = FXMLLoader.load(getClass().getResource("/view/Loading.fxml"));
        stage.setScene(new Scene(load));
        stage.show();

        Task<Scene> task = new Task<Scene>() {
            protected Scene call() throws Exception {
                FXMLLoader fxmlLoader = new FXMLLoader(AppInitializer.class.getResource("/view/Login.fxml"));
                return new Scene(fxmlLoader.load());
            }
        };
        task.setOnSucceeded(e -> {
            Scene value = task.getValue();
            stage.setTitle("Serenity Mental Health Care");
            stage.setResizable(false);
            stage.setScene(value);
        });
        new Thread(task).start();

//        Session session = FactoryConfiguration.getInstance().getSession();
//        Transaction transaction = session.beginTransaction();
//        User user = new User();
//        user.setUsername("admin");
//        user.setPassword("1111");
//        user.setEmail("admin@gmail.com");
//        user.setRole("admin");


//        session.persist(user);
//        transaction.commit();
//        session.close();
    }
}
