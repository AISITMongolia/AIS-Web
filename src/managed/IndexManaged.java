package managed;

import dto.MenuDTO;
import ejb.MenuBean;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.util.List;

@ManagedBean(name = "indexManaged")
@ViewScoped
public class IndexManaged {
    private static final String ACTIVE = "active";
    private static final String INDEX = "menu_index";
    private List<MenuDTO> menuDTOS;

    @EJB
    private MenuBean menuBean;

    @PostConstruct
    public void init() {
        menuDTOS = menuBean.costumerMenu();
    }

//    getter and setter

    public String getActiveData() {
        return ACTIVE;
    }

    public String getIndexData() {
        return INDEX;
    }

    public List<MenuDTO> getMenuDTOS() {
        return menuDTOS;
    }

    public void setMenuDTOS(List<MenuDTO> menuDTOS) {
        this.menuDTOS = menuDTOS;
    }
}
