import React from 'react';
import {Datagrid, DateField, DateInput, EditButton, Filter, List, TextField, TextInput} from 'react-admin';

const Filters = (props) => (
    <Filter {...props}>
        <TextInput label={'姓名'} source="name" allowEmpty alwaysOn resetable/>
        <TextInput label={'手机'} source="mobile" allowEmpty alwaysOn resetable/>
        <TextInput label={'电子邮箱'} source="email" allowEmpty alwaysOn resetable/>
        <TextInput label={'备注'} source="remark" allowEmpty alwaysOn resetable/>
        <DateInput label={'创建时间起始值'} source="createdTime.lowerBound" allowEmpty alwaysOn/>
        <DateInput label={'创建时间结束值'} source="createdTime.upperBound" allowEmpty alwaysOn/>
        <DateInput label={'最近修改时间起始值'} source="modifiedTime.lowerBound" allowEmpty alwaysOn/>
        <DateInput label={'最近修改时间结束值'} source="modifiedTime.upperBound" allowEmpty alwaysOn/>
    </Filter>
);

export const RegistrationList = props => {
    console.info('RegistrationList:', props);
    return (
        <List {...props} filters={<Filters/>}>
            <Datagrid rowClick="show">
                <TextField label={'姓名'} source="name"/>
                <TextField label={'年龄'} source="age"/>
                <TextField label={'手机'} source="mobile"/>
                <TextField label={'报名类型'} source="typeId"/>
                <TextField label={'电子邮箱'} source="email"/>
                <TextField label={'备注'} source="remark"/>
                <TextField label={'创建者主键'} source="creatorId"/>
                <DateField label={'创建时间'} source="createdTime" showTime/>
                <TextField label={'修改者主键'} source="modifierId"/>
                <DateField label={'最近修改时间'} source="modifiedTime" showTime/>
                <EditButton/>
            </Datagrid>
        </List>
    )
};
