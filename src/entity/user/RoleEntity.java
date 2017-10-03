package entity.user;

import entity.menu.MenuEntity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ROLE")
@NamedQueries(
        {
                @NamedQuery(name = "RoleEntity.findAll", query = "SELECT o FROM RoleEntity o WHERE o.role_code = :roleCode"),
        }
)
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GN")
    @SequenceGenerator(name = "GN", sequenceName = "SEQ_ROLE_ID", allocationSize = 1)
    @Column(name = "ROLE_ID")
    private long role_id;

    @Column(name = "ROLE_NAME")
    private String role_name;

    @Column(name = "ROLE_CODE")
    private String role_code;

    @Column(name = "REG_DATE")
    private Date reg_date;

    @Column(name = "REG_USER")
    private String reg_user;

    @ManyToMany(mappedBy = "roleEntities")
    private List<MenuEntity> menuEntities;

    public long getRole_id() {
        return role_id;
    }

    public void setRole_id(long role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public String getRole_code() {
        return role_code;
    }

    public void setRole_code(String role_code) {
        this.role_code = role_code;
    }

    public Date getReg_date() {
        return reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

    public String getReg_user() {
        return reg_user;
    }

    public void setReg_user(String reg_user) {
        this.reg_user = reg_user;
    }

    public List<MenuEntity> getMenuEntities() {
        return menuEntities;
    }

    public void setMenuEntities(List<MenuEntity> menuEntities) {
        this.menuEntities = menuEntities;
    }
}
