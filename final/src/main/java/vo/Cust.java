package vo;

public class Cust {
    private String id;
    private String pwd;
    private String name;
    private String acc;

    public Cust() {
    }

    public Cust(String id, String pwd, String name, String acc) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
        this.acc = acc;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    @Override
    public String toString() {
        return "Cust{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", acc='" + acc + '\'' +
                '}';
    }
}
