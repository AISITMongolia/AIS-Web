package ejb;

import converter.RoleConverter;
import dto.MenuDTO;
import entity.user.RoleEntity;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class MenuBean {
    private static final String COSTUMER_CODE = "cost";

    @PersistenceContext(name = "aisOracle")
    private EntityManager em;

    public List<MenuDTO> costumerMenu() {
        TypedQuery<RoleEntity> namedQuery = em.createNamedQuery("RoleEntity.findAll", RoleEntity.class).setParameter("roleCode", COSTUMER_CODE);
        if (namedQuery != null)
            if (!namedQuery.getResultList().isEmpty())
                return new RoleConverter().convertDto(namedQuery.getSingleResult()).getMenuDTOS();
            else return null;
        else return null;
    }
}