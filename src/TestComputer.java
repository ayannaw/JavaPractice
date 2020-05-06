public class TestComputer {
    public static void main(String[] args) {
        Computer[] labComputers = new Computer[10];
        Computer myComputer = new Computer ("Acme", "Intel", 2, 160, 2.4);
        Notebook yourComputer = new Notebook("DellGate", "AMD", 4, 240,
                1.8,15.0, 7.5);

        System.out.println("My Computer: \n" + myComputer.toString());
        System.out.println("Your Computer: \n" + yourComputer.toString());

        for(int i = 0; i < labComputers.length; i++) {
            if(i%2 == 0) {
                labComputers[i] = myComputer;
            }
            else {
                labComputers[i] = yourComputer;
            }
        }

        for(int x = 0; x < labComputers.length; x++) {
            System.out.println("Computer " + (x+1) + ":\n" + labComputers[x].toString());
        }

        System.out.println("---------------------------------------------");
        int computerPower = myComputer.compareComputer(yourComputer);

        if(computerPower < 0) {
            System.out.println("Your computer has more power than my computer");
        }
        else if (computerPower == 0) {
            System.out.println("Our computers have the same power");
        } else {
            System.out.println("My computer has more power than your computer");
        }

        Vegetable veggie = new Vegetable("Carrot Sticks");

        System.out.println(veggie.toString());
    }
}
