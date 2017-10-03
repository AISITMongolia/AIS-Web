package dto;

import java.util.List;

public class MenuDTO {
    private long menuIdDto;
    private String menuNameEngDto;
    private String menuNameMonDto;
    private String menuCodeDto;
    private String menuSortDto;
    private String loginRequiredDto;
    private List<RoleDTO> roleDTOS;

    public long getMenuIdDto() {
        return menuIdDto;
    }

    public void setMenuIdDto(long menuIdDto) {
        this.menuIdDto = menuIdDto;
    }

    public String getMenuNameEngDto() {
        return menuNameEngDto;
    }

    public void setMenuNameEngDto(String menuNameEngDto) {
        this.menuNameEngDto = menuNameEngDto;
    }

    public String getMenuNameMonDto() {
        return menuNameMonDto;
    }

    public void setMenuNameMonDto(String menuNameMonDto) {
        this.menuNameMonDto = menuNameMonDto;
    }

    public String getMenuCodeDto() {
        return menuCodeDto;
    }

    public void setMenuCodeDto(String menuCodeDto) {
        this.menuCodeDto = menuCodeDto;
    }

    public String getMenuSortDto() {
        return menuSortDto;
    }

    public void setMenuSortDto(String menuSortDto) {
        this.menuSortDto = menuSortDto;
    }

    public String getLoginRequiredDto() {
        return loginRequiredDto;
    }

    public void setLoginRequiredDto(String loginRequiredDto) {
        this.loginRequiredDto = loginRequiredDto;
    }

    public List<RoleDTO> getRoleDTOS() {
        return roleDTOS;
    }

    public void setRoleDTOS(List<RoleDTO> roleDTOS) {
        this.roleDTOS = roleDTOS;
    }
}
