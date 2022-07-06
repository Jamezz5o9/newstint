import java.util.Scanner;

public class USSD {
    public static void main(String[] args) {
        options();
        checkUSSDInput();

    }
    static void options(){
        System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                "1. Phone book", "2. Messgaes", "3. Chat", "4. Call Register",
                "5. Tones", "6. Settings", "7. Call divert", "8. Games",
                "9. Calculator", "10. Reminders", "11. Clock", "12. Profiles", "13. Sim services");
    }
    static void checkUSSDInput(){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an option");
        int ussdInput = input.nextInt();

        switch(ussdInput){
            case 1: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                    "1. Search", "2. Services", "3. Add Name", "4. Erase", "5. Edit",
                    "6. Assign tone", "7. Send b'card", "8. Options >",
                    "9. Speed dials", "10. Voice tags");

            System.out.println("Enter an option");
            int ussdInput3 = input.nextInt();
            System.out.printf("%s%n%s%n", "1. Type of view", "2. Memory status");
            break;

            case 2: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                    "1. Write messages", "2. Inbox", "3. Outbox", "4. Picture messages",
                    "5. Templates", "6. Smileys", "7. Messages settings >",
                    "8. Info service", "9. Voice mailbox number", "10. Service command editor");

            System.out.println("Enter an option");
            int ussdInput4 = input.nextInt();

            System.out.printf("%s%n%s%n", "1. Set 1 >", "2. Common >");

            System.out.print("Enter an option");
            int newInput1 = input.nextInt();
            switch(newInput1){
                case 1: System.out.printf("%s%n%s%n%s%n", "1. Messages centre number", "2. Messages sent as",
                        "3. Message validity");
                break;
                case 2: System.out.printf("%s%n%s%n%s%n", "1. Delivery reports", "2. Reply via same centre",
                        "3. Character support");
                break;
            }
            break;
            case 3: System.out.println("Chat");
            break;
            case 4: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                    "1. Missed calls", "2. Received calls", "3. Dialled numbers", "4. Erase recent call lists",
                    "5. Show call duration >", "6. Show call cost >", "7. Call cost settings", "8. Prepaid credit");

                System.out.println("Enter an option");
                int newInput2 = input.nextInt();
                switch(newInput2){
                    case 5: System.out.printf("%s%n%s%n%s%n%s%n%s%n", "1. Last call duration", "2. All calls' duration", "3. Received calls' duration",
                            "4. Dialled calls' duration", "5. Clear timers");
                    break;
                    case 6:  System.out.printf("%s%n%s%n%s%n", "1. Last call cost", "2. All calls' cost", "3. Clear counters");
                    break;
                    case 7: System.out.printf("%s%n%s%n", "1. Call cost limit", "2. Show cost in");
                    break;
                }
                break;

            case 5: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n%s%n%s%n",
                    "1. Ringing tone", "2. Ringing volume", "3. Incoming call alert", "4. Composer",
                    "5. Message alert tone", "6. Keypad tones", "7. Warning and game tones", "8. Screen saver");
            break;
            case 6: System.out.printf("%s%n%s%n%s%n%s%n","1. Call settings >", "2. Phone settings >", "3. Security settings >", "4. Restore factory settings");

            System.out.println("Please another option");
            int newInput3 = input.nextInt();
            switch(newInput3){
                case 1: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1. Automatic redial", "2. Speed dialling", "3. Call waiting options", "4. Own number sending",
                        "5. Phone line in use", "6. Automatic answer");
                    break;
                case 2: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1. Language", "2. Cell info display", "3. Welcome note", "4. Network selection",
                        "5. Lights", "6. Confirm SIM service actions");
                    break;
                case 3: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1. PIN code request", "2. Call barring service", "3. Fixed dialling", "4. Closed user group",
                        "5. Phone security", "6. Change access codes");
                    break;
                case 4: System.out.printf("%s%n", "Restore factory settings");
                    break;
            }
            break;
            case 7: System.out.printf("%s%n", "7. Call divert");
                break;

            case 8: System.out.printf("%s%n", "8. Games");
                break;

            case 9: System.out.printf("%s%n", "9. Calculator");
                break;

            case 10: System.out.printf("%s%n", "10. Reminders");
                break;

            case 11: System.out.printf("%s%n",  "11. Clock >");

                System.out.println("Please select an option");
                int newInput4 = input.nextInt();

                switch (newInput4){
                    case 1: System.out.printf("%s%n%s%n%s%n%s%n%s%n%s%n", "1. Alarm clock", "2. Clock settings", "3. Date setting", "4. Stopwatch",
                            "5. Countdown timer", "6. Auto update of date and time");
                        break;
                }
                break;

            case 12: System.out.printf("%s%n", "Profiles");
                break;
            case 13: System.out.printf("%s%n", "SIM serices");
                break;


        }

    }
}