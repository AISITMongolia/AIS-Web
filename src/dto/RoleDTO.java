package dto;

import java.util.Date;
import java.util.List;

public class RoleDTO {
    private long roleIdDto;
    private String roleNameDto;
    private String roleCodeDto;
    private Date regDateDto;
    private String regUserDto;
    private List<MenuDTO> menuDTOS;

    public long getRoleIdDto() {
        return roleIdDto;
    }

    public void setRoleIdDto(long roleIdDto) {
        this.roleIdDto = roleIdDto;
    }

    public String getRoleNameDto() {
        return roleNameDto;
    }

    public void setRoleNameDto(String roleNameDto) {
        this.roleNameDto = roleNameDto;
    }

    public String getRoleCodeDto() {
        return roleCodeDto;
    }

    public void setRoleCodeDto(String roleCodeDto) {
        this.roleCodeDto = roleCodeDto;
    }

    public Date getRegDateDto() {
        return regDateDto;
    }

    public void setRegDateDto(Date regDateDto) {
        this.regDateDto = regDateDto;
    }

    public String getRegUserDto() {
        return regUserDto;
    }

    public void setRegUserDto(String regUserDto) {
        this.regUserDto = regUserDto;
    }

    public List<MenuDTO> getMenuDTOS() {
        return menuDTOS;
    }

    public void setMenuDTOS(List<MenuDTO> menuDTOS) {
        this.menuDTOS = menuDTOS;
    }
}
