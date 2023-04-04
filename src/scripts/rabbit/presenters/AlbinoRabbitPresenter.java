package scripts.rabbit.presenters;

import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import scripts.rabbit.RabbitModel;
import scripts.rabbit.base.RabbitPresenter;

public class AlbinoRabbitPresenter extends RabbitPresenter {

    public AlbinoRabbitPresenter(Pane layer, Image image, RabbitModel model) {
        super(layer, image, model);
    }

    @Override
    public void dispose(){
        super.dispose();
    }

}
