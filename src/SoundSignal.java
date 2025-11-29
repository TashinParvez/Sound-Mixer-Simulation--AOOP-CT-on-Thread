public class SoundSignal implements Runnable {
    SoundMixer obj;
    boolean flag;   // true = add
    int arr[];

//    int signal;

    SoundSignal(SoundMixer obj, int[] arr, boolean flag) {
        this.obj = obj;
        this.flag = flag;
        this.arr = arr;
    }


    @Override
    public void run() {
        if (flag) {
            for (int i = 0; i < 5; i++) {

             //   obj.mixedSignal = this.arr[i];
                obj.addSoundSignal(i, this.arr[i]);
             //   obj.arr[i] += arr[i]; // correct
            }

            //  obj.addSoundSignal(signal);
        } else {
            for (int i = 0; i < 5; i++) {

                obj.removeoundSignal(i, this.arr[i]);
              //  obj.arr[i] -= arr[i];
            }
//            obj.removeoundSignal(signal);
        }
    }
}
