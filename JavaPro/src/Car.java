public class Car {

    public class  start {

        private void startElectricity(){
            System.out.println("Start Electricity");
        }
        private void startCommand(){
            System.out.println("Start Command");
        }
        private void startFuelSystem(){
            System.out.println("Start Fuel System");
        }

        public void start(){          //вызываем private методы
            startElectricity();
            startCommand();
            startFuelSystem();

        }


    }
}
