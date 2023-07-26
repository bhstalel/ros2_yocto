DESCRIPTION = "AUTOM8 ROS2 image"
LICENSE = "MIT"

#include "meta-ros-common/recipes-core/images/ros-image-core.bb"
#include  "recipes-core/images/ros-image-core.bb"
IMAGE_INSTALL_append="bash vim bash" 
EXTRA_IMAGE_FEATURES += "ros-implicit-workspace"

inherit extrausers
EXTRA_USERS_PARAMS = " useradd autom8_dev1; \
                       usermod  -p 'Password_1' autom8_dev1; \
                       usermod  -a -G sudo autom8_dev1; "