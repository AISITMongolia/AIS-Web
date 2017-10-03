package converter;

import dto.MenuDTO;
import dto.RoleDTO;
import entity.user.RoleEntity;

import java.util.List;

public class RoleConverter {

    public RoleDTO convertDto(RoleEntity roleEntity) {
        RoleDTO roleDTO = null;
        if (roleEntity != null) {
            roleDTO = new RoleDTO();
            List<MenuDTO> menuDTOS = null;
            if (roleEntity.getMenuEntities() != null)
                menuDTOS = new MenuConverter().convertListDto(roleEntity.getMenuEntities());

            roleDTO.setRoleIdDto(roleEntity.getRole_id());
            roleDTO.setRoleCodeDto(roleEntity.getRole_code());
            roleDTO.setMenuDTOS(menuDTOS);
        }

        return roleDTO;
    }
}
