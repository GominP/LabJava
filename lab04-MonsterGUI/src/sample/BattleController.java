package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.Timer;
import java.util.TimerTask;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.net.URISyntaxException;

public class BattleController {


    private Timer timer;
    private Monster m1, m2;

    private GameController gameController;

    @FXML ImageView m1Image, m1ActionImg, m2Image, m2ActionImg, effectT1, healMon2, bgMode,m1DeadImg,m2DeadImg,winnerMon1,winnerMon2;
    @FXML Button attackBtn1, attackBtn2, healBtn1, healBtn2, submitH1, submitH2, cancelH1, cancelH2,skipBtn2,skipBtn1;
    @FXML Label nameMon1, nameMon2, hpText1, hpText2, hpLabel1, hpLabel2,skipText;
    @FXML ProgressBar pgBarMon1, pgBarMon2;
    @FXML Text winText, vs, roundText;
    @FXML TextField healField1, healField2;
    @FXML Rectangle frame;

    @FXML
    public void initialize() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                try {
                    m1Image.setImage(new Image(getClass().getResource(m1.getImgPath()).toURI().toString()));
                    m2Image.setImage(new Image(getClass().getResource(m2.getImgPath()).toURI().toString()));

                    gameController = new GameController(m1, m2);
                    nameMon1.setText(m1.getName());
                    nameMon2.setText(m2.getName());
                    pgBarMon1.setProgress((double) m1.getHp() / m1.getMaxhp());
                    pgBarMon2.setProgress((double) m2.getHp() / m2.getMaxhp());
                    hpText1.setText(m1.toStringHp());
                    hpText2.setText(m2.toStringHp());

                    setVisableHealTab();
                    winText.setVisible(false);
                    attackBtn2.setDisable(true);
                    healBtn2.setDisable(true);

                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public void setMonster1(Monster m) { this.m1 = m;
    }

    public void setMonster2(Monster m) { this.m2 = m;
    }


    @FXML
    public void handleAtkBtnOnAction(ActionEvent event) {
        gameController.attackState();
        disableBtn();
        display();
        waitForAction(1);



    }

    @FXML
    public void showHandleHealBtnOnAction() {
        if (gameController.getTurn() > 0) {
            showHealTab();
            disableBtn();
        } else {
            showHealTab();
            disableBtn();

        }
    }

    @FXML
    public void handleHealBtnOnAction() {


        if (gameController.getTurn() > 0) {
            gameController.healState((Integer.parseInt(healField1.getText())));
            setVisableHealTab();
            if (Integer.parseInt(healField1.getText()) >= 0) {
                displayForHeal();
            }

        }
        else {

            gameController.healState((Integer.parseInt(healField2.getText())));
            setVisableHealTab();
            if (Integer.parseInt(healField2.getText()) >= 0) {
                displayForHeal();
            }

        }
        waitForAction(1);


    }

    public void display() {

        hpText1.setText(m1.toStringHp());
        hpText2.setText(m2.toStringHp());
        pgBarMon1.setProgress((double) m1.getHp() / m1.getMaxhp());
        pgBarMon2.setProgress((double) m2.getHp() / m2.getMaxhp());
        actionAttackMon();

//        roundText.setText("Round "+gameController.getRound());


    }

    public void actionAttackMon() {
        if (gameController.getTurn() > 0) {
            m1Image.setVisible(false);
            m1ActionImg.setVisible(true);
            m1ActionImg.setImage(new Image("/images/v1.gif"));




        } else {
            m2Image.setVisible(false);
            m2ActionImg.setVisible(true);
            effectT1.setVisible(true);
            effectT1.setImage(new Image(("/images/e.gif")));
            m2ActionImg.setImage(new Image("/images/t2.gif"));



        }


    }


    public void displayForHeal() {

        hpText1.setText(m1.toStringHp());
        hpText2.setText(m2.toStringHp());
        pgBarMon1.setProgress((double) m1.getHp() / m1.getMaxhp());
        pgBarMon2.setProgress((double) m2.getHp() / m2.getMaxhp());
        actionHealMon();

        healField1.clear();
        healField2.clear();
//        roundText.setText("Round "+gameController.getRound());

    }

    public void actionHealMon() {
        if (gameController.getTurn() > 0) {
            m1Image.setVisible(false);
            m1ActionImg.setVisible(true);
            m1ActionImg.setImage(new Image("/images/v3.gif"));

        } else {
            healMon2.setVisible(true);
            healMon2.setImage(new Image("/images/boom.gif"));


        }

    }

    @FXML public void switchEnableBtn() {
        if (gameController.getTurn() > 0) {
            attackBtn2.setDisable(false);
            healBtn2.setDisable(false);

        } else {
            attackBtn1.setDisable(false);
            healBtn1.setDisable(false);
        }

    }

    public void disableBtn() {
        attackBtn1.setDisable(true);
        healBtn1.setDisable(true);

        attackBtn2.setDisable(true);
        healBtn2.setDisable(true);

    }

    public void setVisableHealTab() {
        hpLabel1.setVisible(false);
        healField1.setVisible(false);
        submitH1.setVisible(false);
        cancelH1.setVisible(false);

        hpLabel2.setVisible(false);
        healField2.setVisible(false);
        submitH2.setVisible(false);
        cancelH2.setVisible(false);

    }

    public void showHealTab() {
        if (gameController.getTurn() > 0) {
            hpLabel1.setVisible(true);
            healField1.setVisible(true);
            submitH1.setVisible(true);
            cancelH1.setVisible(true);
        } else {
            hpLabel2.setVisible(true);
            healField2.setVisible(true);
            submitH2.setVisible(true);
            cancelH2.setVisible(true);
        }

    }

    @FXML public void cancelHeal() {
        setVisableHealTab();
        if (gameController.getTurn() > 0) {
            attackBtn1.setDisable(false);
            healBtn1.setDisable(false);
        } else {
            attackBtn2.setDisable(false);
            healBtn2.setDisable(false);

        }
    }

    public void disableAll() {
        nameMon2.setVisible(false);
        nameMon1.setVisible(false);
        pgBarMon1.setVisible(false);
        pgBarMon2.setVisible(false);
        hpText1.setVisible(false);
        hpText2.setVisible(false);
        vs.setVisible(false);
        m1Image.setVisible(false);
        m2Image.setVisible(false);
        frame.setVisible(false);
        attackBtn1.setVisible(false);
        attackBtn2.setVisible(false);
        bgMode.setVisible(false);


    }


    public void waitForAction(int seconds) {
        timer = new Timer();
        timer.schedule(new RemindTask(), seconds * 1000);
    }

    class RemindTask extends TimerTask {
        public void run() {
            if (gameController.getTurn() > 0 ) {

                try {
                    m1ActionImg.setVisible(false);
                    m1Image.setVisible(true);
                    m1Image.setImage(new Image(getClass().getResource(m1.getImgPath()).toURI().toString()));
                    switchEnableBtn();



                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }
            else if (gameController.getTurn() < 0 ) {

                try {
                    m2ActionImg.setVisible(false);
                    effectT1.setVisible(false);
                    healMon2.setVisible(false);
                    m2Image.setVisible(true);
                    m2Image.setImage(new Image(getClass().getResource(m2.getImgPath()).toURI().toString()));
                    switchEnableBtn();




                } catch (URISyntaxException e) {
                    e.printStackTrace();
                }
            }

            if (m1.getHp() <= 0 || m2.getHp() <= 0) {
                disableBtn();
                roundText.setVisible(false);
                if (m1.getHp() <= 0){
                    m1Image.setVisible(false);
                    m1DeadImg.setVisible(true);
                    m2Image.setVisible(false);
                    winText.setVisible(true);
                    m1DeadImg.setImage(new Image("/images/venom4.gif"));
                    winnerMon2.setImage(new Image("/images/t3.gif"));
                    winText.setText("The Winner is "+ m2.getName());
                }
                else if (m2.getHp() <= 0){
                    m2Image.setVisible(false);
                    m2DeadImg.setVisible(true);
                    winText.setVisible(true);
                    m1Image.setVisible(false);
                    m2DeadImg.setImage(new Image("/images/thanos5.gif"));
                    winnerMon1.setImage(new Image("/images/re.gif"));
                    winText.setText("The Winner is "+ m1.getName());
                }

            }

            gameController.changeTurn();
            roundText.setText("Round "+gameController.getRound());
            timer.cancel(); //Terminate the timer thread
        }
    }



}