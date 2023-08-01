package scenarios;

import base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Step;
import org.testng.annotations.Test;


@Epic("Эпик")
public class Scenario1 extends BaseTest {

    @Test (description = "Первый тест")
    public void openAppTest(){
        print();
        print();
        print();
        print();

    }

    @Step ("Какой то там шаг")
    public void print(){
        System.out.println("1");
    }


}
