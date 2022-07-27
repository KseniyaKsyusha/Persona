package ua.en.kosse.oksana.tommy;

class SamsungPhone extends Phone implements PhoneConnection, PhoneMedia{
    private int cell;

    public SamsungPhone(String phoneName, String modelPhone, int storageVolume,
                        int volumeRam, int cell ){
        super(phoneName,modelPhone,storageVolume,volumeRam);
        this.cell=cell;
    }

    public int getCell() {
        return cell;
    }
    public void setCell(int cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return  "Телефон: "+ getPhoneName() +" Модель: "+ getModelPhone() +
                " Обьем памяти: " + getStorageVolume() + " Обьем ОЗУ: " + getVolumeRAM() +
                " Камера: " + getCell();
    }

    @Override
    public void call() {
        System.out.println("""
                Цілу ніч
                І цілий день
                Чути в хаті:
                — Дзінь-дзелень. –""");

    }

    @Override
    public void massage() {
        System.out.println("Пишіть листи і надсилайте вчасно,\n" +
                "Коли їх ждуть далекі адресати!");
    }

    @Override
    public void photo() {
        System.out.println("Фотографії – це збережені миті, Коли час так невпинно летить.");
    }

    @Override
    public void video() {
        System.out.println("Відосик!");
    }
}