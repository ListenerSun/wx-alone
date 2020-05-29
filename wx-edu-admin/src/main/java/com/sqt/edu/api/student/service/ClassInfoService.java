package com.sqt.edu.api.student.service;

import com.sqt.edu.base.JsonResult;
import com.sqt.edu.dto.request.ClassInfoDTO;
import com.sqt.edu.dto.request.QueryClassInfoDTO;

/**
 * @Description:
 * @author: ListenerSun(男, 未婚) 微信:810548252
 * @Date: Created in 2020-02-12 21:33
 */
public interface ClassInfoService {

    /**********************************************后台管理端需要的接口******************************/

    /** add
     * @param classInfoDTO
     * @return
     */
    JsonResult add(ClassInfoDTO classInfoDTO);


    /** update
     * @param classInfoDTO
     * @return
     */
    JsonResult update(ClassInfoDTO classInfoDTO);

    /** delete
     * @param classInfoId
     * @return
     */
    JsonResult delete(Long classInfoId);

    /**list
     * @return
     */
    JsonResult list(QueryClassInfoDTO queryClassInfoDTO);

    /**发布招生
     * @param classInfoId
     * @return
     */
    JsonResult enrollClass(Long classInfoId);


}
