import React from 'react';
import {Create, maxLength, minValue, NumberInput, required, SimpleForm, TextInput} from 'react-admin';

export const RegistrationCreate = (props) => {
    console.info('RegistrationCreate:', props);
    return (
        <Create {...props}>
            <SimpleForm>
                <TextInput label={'姓名'} source="name" validate={[required(), maxLength(32)]}/>
                <TextInput label={'年龄'} source="age" validate={[required(), maxLength(3)]}/>
                <TextInput label={'手机'} source="mobile" validate={[required(), maxLength(32)]}/>
                <NumberInput label={'报名类型'} source="typeId" validate={[required(), minValue(0)]} min={0}/>
                <TextInput label={'电子邮箱'} source="email" validate={[required(), maxLength(32)]}/>
                <TextInput label={'备注'} source="remark" validate={[required(), maxLength(255)]}/>
            </SimpleForm>
        </Create>
    );
};
