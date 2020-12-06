import React from "react";
import {Resource} from "react-admin";

import {RegistrationList} from './list';
import {RegistrationCreate} from './create';
import {RegistrationEdit} from './edit';
import {RegistrationShow} from './show';

export const Registration = {
    list: RegistrationList,
    create: RegistrationCreate,
    edit: RegistrationEdit,
    show: RegistrationShow
};
const RegistrationResource = <Resource options={{label: '报名申请'}} name="registrations" {...Registration} />;
export default RegistrationResource;
