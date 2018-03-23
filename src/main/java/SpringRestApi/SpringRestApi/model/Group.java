package SpringRestApi.SpringRestApi.model;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


/**
 * Entity class to create data about groups in dataBase
 *
 * @author Yaroslav Makhnov
 */
@Entity
@Table(name = "groups")
public class Group implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private final String groupName;

    public Group(String groupName){
        this.groupName = groupName;
    }

    public Long getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return  id + " " + groupName;
    }
}
