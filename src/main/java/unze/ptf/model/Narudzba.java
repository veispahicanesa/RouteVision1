package unze.ptf.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Narudzba {
    private int id;
    private String broj_narudbe;
    private int klijent_id;
    private LocalDate datum_narudbe;
    private LocalDate datum_isporuke;
    private String vrsta_robe;
    private double kolicina;
    private String jedinica_mjere;
    private String lokacija_preuzimanja;
    private String lokacija_dostave;
    private String napomena;
    private String status;
    private boolean aktivan;
    private LocalDateTime datum_kreiranja;

    public Narudzba() {}

    public Narudzba(String broj_narudbe, int klijent_id) {
        this.broj_narudbe = broj_narudbe;
        this.klijent_id = klijent_id;
        this.aktivan = true;
        this.status = "Novoprijavljena";
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getBroj_narudbe() { return broj_narudbe; }
    public void setBroj_narudbe(String broj_narudbe) { this.broj_narudbe = broj_narudbe; }

    public int getKlijent_id() { return klijent_id; }
    public void setKlijent_id(int klijent_id) { this.klijent_id = klijent_id; }

    public LocalDate getDatum_narudbe() { return datum_narudbe; }
    public void setDatum_narudbe(LocalDate datum_narudbe) { this.datum_narudbe = datum_narudbe; }

    public LocalDate getDatum_isporuke() { return datum_isporuke; }
    public void setDatum_isporuke(LocalDate datum_isporuke) { this.datum_isporuke = datum_isporuke; }

    public String getVrsta_robe() { return vrsta_robe; }
    public void setVrsta_robe(String vrsta_robe) { this.vrsta_robe = vrsta_robe; }

    public double getKolicina() { return kolicina; }
    public void setKolicina(double kolicina) { this.kolicina = kolicina; }

    public String getJedinica_mjere() { return jedinica_mjere; }
    public void setJedinica_mjere(String jedinica_mjere) { this.jedinica_mjere = jedinica_mjere; }

    public String getLokacija_preuzimanja() { return lokacija_preuzimanja; }
    public void setLokacija_preuzimanja(String lokacija_preuzimanja) { this.lokacija_preuzimanja = lokacija_preuzimanja; }

    public String getLokacija_dostave() { return lokacija_dostave; }
    public void setLokacija_dostave(String lokacija_dostave) { this.lokacija_dostave = lokacija_dostave; }

    public String getNapomena() { return napomena; }
    public void setNapomena(String napomena) { this.napomena = napomena; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public boolean isAktivan() { return aktivan; }
    public void setAktivan(boolean aktivan) { this.aktivan = aktivan; }

    public LocalDateTime getDatum_kreiranja() { return datum_kreiranja; }
    public void setDatum_kreiranja(LocalDateTime datum_kreiranja) { this.datum_kreiranja = datum_kreiranja; }
}
