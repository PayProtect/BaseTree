package entity;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by Yakubovsky Dmitry on 24.12.2017.
 */

@Entity
@Table( name = "Media" )
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer uid;

    @Column
    public String path;

    @Column
    public Blob mediafile;
    @Column
    public String description;
    @Column
    public String checksum;
    @Column
    public String change;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Blob getMediafile() {
        return mediafile;
    }

    public void setMediafile(Blob mediafile) {
        this.mediafile = mediafile;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChecksum() {
        return checksum;
    }

    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }
}
