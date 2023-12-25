import ij.IJ;
import ij.ImagePlus;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class oprosadapter {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner kbd = new Scanner(System.in);

        String decision;
        String decisiono;
        int intChoice = 0;

        //Ввод пароля
        boolean passwordTest = true;
        while (passwordTest) {
            System.out.println("Введите пароль");
            String password = kbd.nextLine();
            switch (password) {
                case "admin":
                    passwordTest = true;
                    System.out.println("Пароль: Дата рождения Верховной через запятые по магловскому календарю ");
                    break;

                case "26,12,94":
                    passwordTest = true;
                    System.out.println("Тут вроде нужно год точнее указать");
                    break;

                case "26,12,1994":
                    System.out.println("И кто составляет такие легкие пароли? \nКажется нашего магического администратора пора послать на курсы безопасности...");
                    passwordTest = false;
                    break;

                default:
                    System.out.println("Увы, пароль не соответствует требованиям, пора вспомнить все свои заметки ");

            }
        }

        System.out.println("\nВерховная Анна!\nДобро пожаловать в систему решения проблем и принятия решений. \n");


        //Выбор варианта
        boolean choiceTest = true;
        while (choiceTest) {
            System.out.println("Как только вы улетели в длительный отпуск, случилось то,чего мы опасались!");
            System.out.println("В город Рукси ворвались бунтари маги, которые считают, что именно они должны править миром.\nОни уже захватили большую часть населения и отвели всех в ратушу.");
            System.out.println("Вы же знаете, мы существуем, чтобы сохранять мир и спокойствие");
            System.out.println(" \nЭто зеркало души. Выбирайте с умом. Если решите слукавить, то зеркало об этом узнает! \n  1 - Использовать древнюю магию против магов отступников и помочь маглам \n  2 - Запечатать древнюю магию на 100 лет и не мешать магам рушить мир");
            String choice = kbd.nextLine();
            intChoice = Integer.parseInt(choice);

            System.out.println("\nВы уверены, что хотите выбрать " + choice + " ? ");
            System.out.println(" да или нет ");
            decision = kbd.nextLine();

            switch (decision) {
                case "нет":
                    choiceTest = true;
                    System.out.println("Таааакс, посмотрим что тут у нас \n");
                    break;

                case "да":
                    choiceTest = false;
                    System.out.println("\nВыбор сделан, обратного пути нет!\n");
                    break;

                default:
                    System.out.println("\nЯ не смогло понять Ваш выбор ");

                    boolean repeat = true;

                    while (repeat) {
                        System.out.println("\nВы уверены, что хотите выбрать " + choice + " ? ");

                        System.out.println(" да или нет ");
                        decisiono = kbd.nextLine();

                        switch (decisiono) {
                            case "нет":
                                choiceTest = false;
                                repeat = true;
                                break;

                            case "да":
                                choiceTest =  false;
                                repeat = true;
                                System.out.println("\nВыбор сделан, обратного пути нет!");
                                break;
                            default:
                                System.out.println("\nНе смогло понять Ваш выбор ");
                                repeat = true;
                                break;
                        }
                    }
                    break;
            }
            
        }
        String firstChoice = "\nОтлично, хороший выбор! \nБлагодаря вашему амулету мы получили доступ в темницу к артефактам.\nВаш посыльный(бабочка с палочкой)- весьма забавный малый, если его расколдовать.\nНо не время веселиться!";
        String firstChoicePartTwo = "Стражи быстро отловили всех.\nМаглам опять стерта память.\nВсе здания восстановлены.\nА 'Манок' теперь освещает все, как маяк во мгле";
        String secondChoice = "\nСильный выбор достойного человека!\nХоть нам и не по душе стоять в стороне, но Вы правы, пусть с ними разбираются маглы...";
        String secondChoicePartTwo = "Во всех новостях теперь трубят о магии,заговорах и управлением из тени!\nЧто ж, пора выйти в свет, может хоть так сможем найти больше хороших магов.\nА то последнее время наши ряды существенно поредели...";
        if (intChoice == 1) {
            System.out.println("\nВам письмо от Кодницы:\n");
            System.out.println(firstChoice);
            System.out.println(firstChoicePartTwo);
        } else {
            System.out.println("Зеркало души информирует вас, что был замечен выбор, который противоречит вашим желаниям!");
            System.out.println("\nВам письмо от Кодницы:");
            System.out.println(secondChoice);
            System.out.println(secondChoicePartTwo);
        }
        System.out.println("Осталось последнее приключение на этот час.*ралявантес кертас jpg* \nТеперь на вашем устройстве откроется последняя карта сокровищ. \nСправитесь?)");
        ImagePlus imp = IJ.openImage("C:\\Users\\yri95\\Desktop\\GURU\\FeAny\\src\\main\\resources\\foto.jpg");
        imp.show();
    }
}

