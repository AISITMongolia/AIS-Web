package converter;

import dto.MenuDTO;
import entity.menu.MenuEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MenuConverter {
    List<MenuDTO> convertListDto(List<MenuEntity> menuEntities) {
        List<MenuDTO> menuDTOS = new ArrayList<>();
        menuDTOS.addAll(menuEntities.stream().map(this::convertDto).collect(Collectors.toList()));

        return menuDTOS;
    }

    private MenuDTO convertDto(MenuEntity menuEntity) {
        MenuDTO menuDTO = null;
        if (menuEntity != null) {
            menuDTO = new MenuDTO();

            menuDTO.setMenuIdDto(menuEntity.getMenu_id());
            menuDTO.setMenuCodeDto(menuEntity.getMenu_code());
            menuDTO.setMenuNameEngDto(menuEntity.getMenu_name_eng());
            menuDTO.setMenuNameMonDto(menuEntity.getMenu_name_mon());
            menuDTO.setMenuSortDto(menuEntity.getMenu_sort());
        }

        return menuDTO;
    }
}
