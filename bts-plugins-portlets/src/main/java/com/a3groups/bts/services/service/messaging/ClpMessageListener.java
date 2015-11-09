package com.a3groups.bts.services.service.messaging;

import com.a3groups.bts.services.service.ClpSerializer;
import com.a3groups.bts.services.service.SchoolLocalServiceUtil;
import com.a3groups.bts.services.service.SchoolServiceUtil;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            SchoolLocalServiceUtil.clearService();

            SchoolServiceUtil.clearService();
        }
    }
}
