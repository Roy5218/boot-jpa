package com.bootdo_jpa.common.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.bootdo_jpa.common.domain.FileDO;

/**
 * 文件上传
 * @author bootdo-jpa huyidao---123@163.com
 * @email huyidao---123@163.com
 * @date 2019-04-01 10:19:23
 */
public interface FileRepository extends JpaRepository<FileDO, Long>, JpaSpecificationExecutor<FileDO> {
	
	int deleteByIdIn(Long[] ids);
}
