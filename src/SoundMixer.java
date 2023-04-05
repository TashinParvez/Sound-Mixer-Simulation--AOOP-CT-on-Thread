import java.util.Arrays;

class SoundMixer {
    int mixedSignal = 0;
    int arr[] = {0, 0, 0, 0, 0};

//    synchronized public void addSoundSignal(int soundSignal) { // correct
//        this.mixedSignal = soundSignal;
//    }

    synchronized public void addSoundSignal(int index, int soundSignal) {   // new
        this.mixedSignal = soundSignal;
        arr[index] += mixedSignal;

    }

//    synchronized public void removeoundSignal(int soundSignal) { // correct
//        this.mixedSignal -= soundSignal;
//    }

    synchronized public void removeoundSignal(int index, int soundSignal) {  // new
        this.mixedSignal = soundSignal;
        arr[index] -= mixedSignal;
    }

    @Override
    public String toString() {
        return "SoundMixer{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    synchronized public int getSignal(int index) {
        return arr[index];
    }
}
