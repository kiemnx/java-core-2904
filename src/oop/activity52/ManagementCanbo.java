package oop.activity52;

import java.util.ArrayList;
import java.util.List;

public class ManagementCanbo {
    private int totalCongnhan;
    private List<CongNhan> congNhans;
    private int totalKysu;
    private List<KySu> kySus;

    public ManagementCanbo(List<CongNhan> congNhans, List<KySu> kySus) {
        this.congNhans = congNhans;
        this.kySus = kySus;
    }

    public ManagementCanbo() {
    }

    public int getTotalCongnhan() {
        return totalCongnhan;
    }

    public void setTotalCongnhan(int totalCongnhan) {
        this.totalCongnhan = totalCongnhan;
    }

    public List<CongNhan> getCongNhans() {
        return congNhans;
    }

    public void setCongNhans(List<CongNhan> congNhans) {
        this.congNhans = congNhans;
    }

    public int getTotalKysu() {
        return totalKysu;
    }

    public void setTotalKysu(int totalKysu) {
        this.totalKysu = totalKysu;
    }

    public List<KySu> getKySus() {
        return kySus;
    }

    public void setKySus(List<KySu> kySus) {
        this.kySus = kySus;
    }


    public List<CongNhan> findCongNhanByBac(int bacX){
        List<CongNhan> result = new ArrayList<>();

        for(CongNhan congNhan:congNhans){
            if(congNhan.getBac() == bacX){
                result.add(congNhan);
            }
        }
        return result;
    }

    public List<KySu> findKySuByNganhDaoTao(String nganhDaoTao){
        List<KySu> result = new ArrayList<>();
        for(KySu kySu : kySus){
            if(kySu.getNganhDaoTao().equals(nganhDaoTao)){
                result.add(kySu);
            }
        }
        return result;
    }
}
