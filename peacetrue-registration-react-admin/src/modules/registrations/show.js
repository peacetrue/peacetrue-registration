import React from 'react';
import {DateField, NumberField, Show, SimpleShowLayout, TextField} from 'react-admin';

export const RegistrationShow = (props) => {
    console.info('RegistrationShow:', props);
    return (
        <Show {...props}>
            <SimpleShowLayout>
                <TextField source="name"/>
                <TextField source="age"/>
                <TextField source="mobile"/>
                <NumberField source="typeId" validate={[required(), minValue(0)]} min={0}/>
                <TextField source="email"/>
                <TextField source="remark"/>
                <NumberField source="creatorId" validate={[required(), minValue(0)]} min={0}/>
                <DateField source="createdTime" showTime/>
                <NumberField source="modifierId" validate={[required(), minValue(0)]} min={0}/>
                <DateField source="modifiedTime" showTime/>
            </SimpleShowLayout>
        </Show>
    );
};
