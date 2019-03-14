
from django.urls import path, include
from . import views

urlpatterns = [
    path('', views.index,name='index'),
    path('add', views.addTodo,name='add'),
    path('complete/<todo_id>', views.completeTodo,name='complete'),
    path('deletecomplete', views.deletecomplete,name='deletecomplete'),
    path('deleteall', views.deleteall,name='deleteall')
]