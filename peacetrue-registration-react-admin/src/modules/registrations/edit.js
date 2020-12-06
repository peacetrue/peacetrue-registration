import React from 'react';
import {Edit, maxLength, minValue, NumberInput, required, SimpleForm, TextInput} from 'react-admin';

export const RegistrationEdit = (props) => {
    console.info('RegistrationEdit:', props);
    return (
        <Edit {...props}>
            <SimpleForm>
                <TextInput source="name" validate={[required(), maxLength(32)]}/>
                <TextInput source="age" validate={[required(), maxLength(3)]}/>
                <TextInput source="mobile" validate={[required(), maxLength(32)]}/>
                <NumberInput source="typeId" validate={[required(), minValue(0)]} min={0}/>
                <TextInput source="email" validate={[required(), maxLength(32)]}/>
                <TextInput source="remark" validate={[required(), maxLength(255)]}/>
            </SimpleForm>
        </Edit>
    );
};
