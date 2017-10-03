package entity.menu;

import entity.user.RoleEntity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "MENU")
@NamedQueries(
        {
                @NamedQuery(name = "MenuEntity.findAll", query = "SELECT o FROM MenuEntity o ORDER BY o.menu_sort ASC"),
        }
)
public class MenuEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GN")
    @SequenceGenerator(name = "GN", sequenceName = "SEQ_MENU_ID", allocationSize = 1)
    @Column(name = "MENU_ID")
    private long menu_id;

    @Column(name = "MENU_NAME_ENG")
    private String menu_name_eng;

    @Column(name = "MENU_NAME_MON")
    private String menu_name_mon;

    @Column(name = "MENU_CODE")
    private String menu_code;

    @Column(name = "MENU_SORT")
    private String menu_sort;

    @Column(name = "LOGIN_REQUIRED")
    private String login_required;

    @ManyToMany
    @JoinTable(name = "MENU_ROLE", joinColumns = @JoinColumn(name = "MENU_ID"), inverseJoinColumns = @JoinColumn(name = "ROLE_ID"))
    private List<RoleEntity> roleEntities;

    public long getMenu_id() {
        return menu_id;
    }

    public void setMenu_id(long menu_id) {
        this.menu_id = menu_id;
    }

    public String getMenu_name_eng() {
        return menu_name_eng;
    }

    public void setMenu_name_eng(String menu_name_eng) {
        this.menu_name_eng = menu_name_eng;
    }

    public String getMenu_name_mon() {
        return menu_name_mon;
    }

    public void setMenu_name_mon(String menu_name_mon) {
        this.menu_name_mon = menu_name_mon;
    }

    public String getMenu_code() {
        return menu_code;
    }

    public void setMenu_code(String menu_code) {
        this.menu_code = menu_code;
    }

    public String getLogin_required() {
        return login_required;
    }

    public void setLogin_required(String login_required) {
        this.login_required = login_required;
    }

    public List<RoleEntity> getRoleEntities() {
        return roleEntities;
    }

    public void setRoleEntities(List<RoleEntity> roleEntities) {
        this.roleEntities = roleEntities;
    }

    public String getMenu_sort() {
        return menu_sort;
    }

    public void setMenu_sort(String menu_sort) {
        this.menu_sort = menu_sort;
    }
}
