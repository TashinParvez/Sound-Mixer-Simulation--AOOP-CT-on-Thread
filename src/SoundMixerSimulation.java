public class SoundMixerSimulation {
    public static void main(String[] args) throws InterruptedException {
        SoundMixer obj = new SoundMixer();

        int arr1[] = {1, 2, 3, 4, 5};
        SoundSignal add1 = new SoundSignal(obj, arr1, true);

        int arr2[] = {6, 7, 8, 9, 10};
        SoundSignal remove = new SoundSignal(obj, arr2, false);

        int arr3[] = {11, 12, 13, 14, 15};
        SoundSignal add2 = new SoundSignal(obj, arr3, true);

        Thread t1 = new Thread(add1);
        Thread t2 = new Thread(remove);
        Thread t3 = new Thread(add2);


        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

//        for (int i = 0; i < 5; i++) {
//            System.out.print(obj.arr[i] + " "); // correct
//        }

        for (int i = 0; i < 5; i++) {
            System.out.print(obj.getSignal(i) + " ");
            //  System.out.print(obj.arr[i] + " ");  // correct
        }

        System.out.println();
        //   System.out.println(obj.toString());
    }
}
