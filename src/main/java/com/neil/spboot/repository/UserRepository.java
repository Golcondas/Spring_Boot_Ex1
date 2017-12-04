package com.neil.spboot.repository;

import com.neil.spboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,Long>{
    User findByUserName(String userName);
    User findByUserNameOrEmail(String username, String email);

    /**
     * 修改
     * @param userName
     * @param ursid
     * @return
     */
    @Transactional
    @Modifying
    @Query("update User u set u.userName = :userName  where u.usrID= :ursid ")
    int modifyByIdAndUserId(@Param("userName") String  userName,@Param("ursid") Long ursid );

    /**
     * 删除
     * @param ursid
     */
    @Transactional
    @Modifying
    @Query("delete from User where usrID= :ursid")
    int deleteByUserId(@Param("ursid") Long ursid);
}
