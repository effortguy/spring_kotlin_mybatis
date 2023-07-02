package com.example.spring_kotlin_mybatis.typehandler

import com.example.spring_kotlin_mybatis.CustomerType
import org.apache.ibatis.type.BaseTypeHandler
import org.apache.ibatis.type.JdbcType
import java.sql.CallableStatement
import java.sql.PreparedStatement
import java.sql.ResultSet

class CustomerTypeHandler : BaseTypeHandler<CustomerType>() {

    override fun setNonNullParameter(ps: PreparedStatement, i: Int, parameter: CustomerType, jdbcType: JdbcType) {
        ps.setString(i, parameter.code)
    }

    override fun getNullableResult(rs: ResultSet, columnName: String): CustomerType? {
        return CustomerType.find(rs.getString(columnName))
    }

    override fun getNullableResult(rs: ResultSet, columnIndex: Int): CustomerType? {
        return CustomerType.find(rs.getString(columnIndex))
    }

    override fun getNullableResult(cs: CallableStatement, columnIndex: Int): CustomerType? {
        return CustomerType.find(cs.getString(columnIndex))
    }
}