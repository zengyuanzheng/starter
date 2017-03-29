package china.z.starter.admin.model;

import javax.persistence.*;

/**
 * Created by sherlock on 2017-03-29.
 */
@Entity
@Table(name = "user", schema = "starter")
public class TUser {
    private String uuid;
    private String email;
    private String phone;
    private String password;
    private String remark;
    private String createTime;
    private String createUserUuid;
    private String updateTime;
    private String updateUserUuid;
    private int state;

    @Id
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Basic
    @Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "create_user_uuid")
    public String getCreateUserUuid() {
        return createUserUuid;
    }

    public void setCreateUserUuid(String createUserUuid) {
        this.createUserUuid = createUserUuid;
    }

    @Basic
    @Column(name = "update_time")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "update_user_uuid")
    public String getUpdateUserUuid() {
        return updateUserUuid;
    }

    public void setUpdateUserUuid(String updateUserUuid) {
        this.updateUserUuid = updateUserUuid;
    }

    @Basic
    @Column(name = "state")
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TUser tUser = (TUser) o;

        if (state != tUser.state) return false;
        if (uuid != null ? !uuid.equals(tUser.uuid) : tUser.uuid != null) return false;
        if (email != null ? !email.equals(tUser.email) : tUser.email != null) return false;
        if (phone != null ? !phone.equals(tUser.phone) : tUser.phone != null) return false;
        if (password != null ? !password.equals(tUser.password) : tUser.password != null) return false;
        if (remark != null ? !remark.equals(tUser.remark) : tUser.remark != null) return false;
        if (createTime != null ? !createTime.equals(tUser.createTime) : tUser.createTime != null) return false;
        if (createUserUuid != null ? !createUserUuid.equals(tUser.createUserUuid) : tUser.createUserUuid != null)
            return false;
        if (updateTime != null ? !updateTime.equals(tUser.updateTime) : tUser.updateTime != null) return false;
        if (updateUserUuid != null ? !updateUserUuid.equals(tUser.updateUserUuid) : tUser.updateUserUuid != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uuid != null ? uuid.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (createUserUuid != null ? createUserUuid.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (updateUserUuid != null ? updateUserUuid.hashCode() : 0);
        result = 31 * result + state;
        return result;
    }
}
