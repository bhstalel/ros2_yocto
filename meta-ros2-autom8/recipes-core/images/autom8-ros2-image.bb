DESCRIPTION = "AUTOM8 ROS2 image"
LICENSE = "MIT"

#include "meta-ros-common/recipes-core/images/ros-image-core.bb"
#include  "recipes-core/images/ros-image-core.bb"
IMAGE_INSTALL_append="bash vim bash" 
EXTRA_IMAGE_FEATURES += "ros-implicit-workspace"

inherit extrausers
EXTRA_USERS_PARAMS = " useradd customUser1; \
                       useradd customUser2; \
                       usermod  -p 'Password_1' customUser1; \
                       usermod  -p 'Password_2' customUser2; \
                       usermod  -a -G sudo customUser1; \
                       usermod  -a -G sudo customUser2;"