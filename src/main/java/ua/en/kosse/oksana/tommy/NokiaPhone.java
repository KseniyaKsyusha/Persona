package ua.en.kosse.oksana.tommy;

class NokiaPhone extends Phone implements PhoneConnection {

    public NokiaPhone(String phoneName, String modelPhone, int storageVolume, int volumeRAM) {
        super(phoneName, modelPhone, storageVolume, volumeRAM);
    }

    @Override
    public String toString() {
        return "Телефон: " + getPhoneName() + " Модель: " + getModelPhone() +
                " Обьем памяти: " + getStorageVolume() + " Обьем ОЗУ: " + getVolumeRAM();
    }

    @Override
    public void call() {
        System.out.println("У меня зазвонил телефон. — Кто говорит?");
    }

    @Override
    public void massage() {
        System.out.println("Я - поэт, зовусь я Цветик. От меня вам всем приветик.");
    }
}
