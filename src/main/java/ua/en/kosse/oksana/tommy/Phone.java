package ua.en.kosse.oksana.tommy;

abstract class Phone {

    private String phoneName;
    private String modelPhone;
    private int storageVolume;
    private int volumeRAM;

    public Phone(String phoneName, String modelPhone, int storageVolume, int volumeRAM) {
        this.phoneName = phoneName;
        this.modelPhone = modelPhone;
        this.storageVolume = storageVolume;
        this.volumeRAM = volumeRAM;
    }

    public String getModelPhone() {
        return modelPhone;
    }
    public void setModelPhone(String modelPhone) {
        this.modelPhone = modelPhone; }

    public String getPhoneName() {
        return phoneName;
    }
    public void setPhoneName(String phoneName ) {
        this.phoneName = phoneName; }

    public int getStorageVolume() {
        return storageVolume;
    }
    public void setStorageVolume(int volumeRAM ) {
        this.volumeRAM = volumeRAM; }

    public int getVolumeRAM() {
        return volumeRAM;
    }
    public void setVolumeRAM(int volumeRAM) {
        this.volumeRAM = volumeRAM; }
}