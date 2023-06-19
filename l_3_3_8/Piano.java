public class Piano {
    public Key[] keys;

    public void tune() {
        // Настройка пианино
    }

    public void play() {
        pressKey(keys[1]);
        pressKey(keys[0]);
        pressKey(keys[2]);
        pressKey(keys[0]);
    }

    public void pressKey(Key k) {
        System.out.println(k.getSound());
    }
}


