package spring.learnSpringSecurity.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "TeluskoLearning")
public class Job {
    private String desc;
    private int exp;
    private String profile;
    private String[] techs;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Job{" +
                "desc='" + desc + '\'' +
                ", exp=" + exp +
                ", profile='" + profile + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }

    public Job() {
    }
}
