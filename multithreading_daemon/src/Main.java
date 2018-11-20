/*Создайте поток-демон и выведите про него как можно больше информации.*/
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Daemon daemon = new Daemon();
        Daemon daemon1 = new Daemon();
        daemon.setDaemon(true); //установка для потока режима демона
        daemon.start();
        daemon1.start();
    }
}

class Daemon extends Thread{
    @Override
    public void run(){
        try {
            if (isDaemon()) { //является ли поток демоном
                System.out.println("Старт потока-демона");
                for (int i = 0; i<50; i++)
                    System.out.println("thread daemon i = " + i);
                sleep(1000);
            } else {
                System.out.println("Старт обычного потока");
                for (int i = 0; i<50; i++)
                    System.out.println("thread i = " + i);
                sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (!isDaemon()) { //выполняется поток или ! нет
                System.out.println("Завершение работы обычного потока");
            } else {
                System.out.println("Завершение работы потока-демона");
            }
        }
    }
}