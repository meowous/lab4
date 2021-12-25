import javax.swing.*;
import java.net.SocketOption;
import java.net.SocketTimeoutException;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Human each = new Human("Каждый");
        Human.AHumanNested eachNested = each.new AHumanNested();

        Human skuperdiay = new Human("Господин Скуперфильд");
        Human.AHumanNested skuperdiayNested = skuperdiay.new AHumanNested();

        Human millionaire = new Human("Миллионер");
        Human.AHumanNested millionaireNested = millionaire.new AHumanNested();

        Human skryagins = new Human("Скрягинс"){
            public String heard(){
                return "слышал он черезвычайно скверно";
            }
        };

        Author Lol = new Author("Автор");
        
        ObjectsStory Ferting = new ObjectsStory("Фертинг");
        ObjectsStory Capital = new ObjectsStory("Капитал");
        ObjectsStory bigCapital = new ObjectsStory("колосальное состояние");

        while (true){
            System.out.println("Какой был Миллионер?");
            Scanner scanner = new Scanner(System.in);
            try {
                String adjective = scanner.next();
                if (Objects.equals(adjective, "худой")){
                    break;
                }
                throw new AdjectiveException();
            }catch (AdjectiveException e){
                System.out.print(e);
            }
        }

        System.out.print(each.saw(skuperdiayNested));

        System.out.println(each.dontBelieved(millionaireNested) + Lol.speak(", настолько он весь был худой и, если так можно выразиться, узловатый."));
        skuperdiayNested.setFeel(Feelings.GREED);

        INeedSay needSay;
        needSay = () -> {return "Нужно, однако ж, сказать, что ";};


        System.out.println(needSay.needSay() + skuperdiay.lostWeight());
        System.out.print(skuperdiay.spend(Ferting));
        System.out.print(skuperdiay.toBeNervous());
        System.out.println(skuperdiay.torment() + skuperdiay.loseWeight());
        System.out.println(skuperdiay.compensate() + skuperdiay.ate() + skuperdiay.gainWeight() + "\n" + Lol.speak("так как ему не давала покоя мысль, что ") +
                skuperdiayNested.getName() + skuperdiay.hasSpent());
        while (true){
            System.out.println("Что вредит его здоровью?");
            Scanner scanner = new Scanner(System.in);
            try {
                String word = scanner.next();
                if (Objects.equals(word, "жадность")){
                    break;
                }
                throw new ItemException();
            }catch (ItemException e){
                System.out.println(e);
            }
        }
        System.out.println(skuperdiay.knew() + Lol.speak(", что его жадность вредит его же здоровью, но со своей собачьей натурой (так он говорил сам)") + skuperdiay.cantDoSomething());
        System.out.print(skuperdiay.thinking(bigCapital));

    }
}
